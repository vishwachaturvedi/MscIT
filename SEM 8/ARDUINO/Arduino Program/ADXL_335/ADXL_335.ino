const int xpin = A1;
const int ypin = A2;
const int zpin = A3;

float threshold = 6;
int acc = 0;
  float totvect[100] = {0};
  float totave[100] = {0};
  float xaccl[100] = {0};
  float yaccl[100] = {0};
  float zaccl[100] = {0};
  float xval[100] = {0};
float yval[100] = {0};
float zval[100] = {0};
  float xavg, yavg, zavg;
int steps, flag = 0;


void calibrate();

void setup() {
  // put your setup code here, to run once:
  pinMode(13,OUTPUT);
  Serial.begin(9600);
  calibrate();
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(13,HIGH);
  delay(500);
  digitalWrite(13,LOW);
  delay(500);

  
  
  for (int a = 0; a < 100; a++)
  {
     xaccl[a] = float(analogRead(xpin) - 345);
    delay(1);
    yaccl[a] = float(analogRead(ypin) - 346);
    delay(1);
    zaccl[a] = float(analogRead(zpin) - 416);
    delay(1);
    totvect[a] = sqrt(((xaccl[a] - xavg) * (xaccl[a] - xavg)) + ((yaccl[a] - yavg) * (yaccl[a] - yavg)) + ((zval[a] - zavg) * (zval[a] - zavg)));
    totave[a] = (totvect[a] + totvect[a - 1]) / 2 ;
    Serial.println("totave[a]");
    Serial.println(totave[a]);
    delay(100);
    if (totave[a] > threshold && flag == 0)
    {
      steps = steps + 1;
      flag = 1;
    }
    else if (totave[a] > threshold && flag == 1)
    {
       }
    if (totave[a] < threshold   && flag == 1)
    {
      flag = 0;
    }
    if (steps < 0) {
      steps = 0;
    }
    Serial.println('\n');
    Serial.print("steps: ");
    Serial.println(steps);
    delay(1000);
     }
  delay(1000);
  
}

 
void calibrate()
{
  float sum = 0;
  float sum1 = 0;
  float sum2 = 0;
  for (int i = 0; i < 100; i++) {
    xval[i] = float(analogRead(xpin) - 345);
    sum = xval[i] + sum;
  }
  delay(100);
  xavg = sum / 100.0;
  Serial.println(xavg);
  for (int j = 0; j < 100; j++)
  {
     yval[j] = float(analogRead(ypin) - 346);
    sum1 = yval[j] + sum1;
  }
  yavg = sum1 / 100.0;
  Serial.println(yavg);
  delay(100);
  for (int q = 0; q < 100; q++)
  {
    zval[q] = float(analogRead(zpin) - 416);
    sum2 = zval[q] + sum2;
  }
  zavg = sum2 / 100.0;
  delay(100);
  Serial.println(zavg);
}