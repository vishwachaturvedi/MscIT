int yellowLight = 5;
int redLight = 2;
int whiteLight = 9;
int shortDim = 100;
int mediumDim = 500;
int longDim = 1000;

void setup() {
  // put your setup code here, to run once:
pinMode(whiteLight,OUTPUT);
pinMode(redLight,OUTPUT);
pinMode(yellowLight,OUTPUT);
}

void loop() {

digitalWrite(9,HIGH);
delay(shortDim);
digitalWrite(9,LOW);
digitalWrite(2,HIGH);
delay(shortDim);
digitalWrite(2,LOW);
digitalWrite(5,HIGH);
delay(shortDim);
digitalWrite(5,LOW);

digitalWrite(9,HIGH);
delay(mediumDim);
digitalWrite(9,LOW);
digitalWrite(2,HIGH);
delay(mediumDim);
digitalWrite(2,LOW);
digitalWrite(5,HIGH);
delay(mediumDim);
digitalWrite(5,LOW);

digitalWrite(9,HIGH);
delay(shortDim);
digitalWrite(9,LOW);
digitalWrite(2,HIGH);
delay(shortDim);
digitalWrite(2,LOW);
digitalWrite(5,HIGH);
delay(shortDim);
digitalWrite(5,LOW);
}
