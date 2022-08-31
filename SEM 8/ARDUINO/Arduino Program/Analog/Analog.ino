int redPin = 10 ;
int yellowPin = 11;
int whitePin = 9 ;
int greenPin = 12;
int value = 0;
void setup() {
  // put your setup code here, to run once:
  pinMode(redPin,OUTPUT);
  pinMode(yellowPin,OUTPUT);
  pinMode(whitePin,OUTPUT);
  pinMode(greenPin,OUTPUT);

}

void loop() {
  while(value < 255)
  {
    analogWrite(whitePin,value);
    value = value + 100;
    delay(500);
  }
  while(value > 0)
  {
    analogWrite(whitePin,value);
    value = value - 100;
    delay(500);
  }

}
