#include <Wire.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 16, 2);  
#include <Servo.h>
Servo servo1;
Servo servo2;

#define SERV01 2
// #define SERV02 4
#define TRIG1 6
#define ECHO1 7

void setup() {
  servo1.attach(SERV01);
  // servo2.attach(SERV02);
  pinMode(TRIG1, OUTPUT);
  pinMode(ECHO1, INPUT);

  Serial.begin(9600);

}

void loop() {
  digitalWrite(TRIG1, HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIG1, LOW);

  double selang = pulseIn(ECHO1, HIGH);

  double jarak = (selang * 0.0343) / 2.0;

  lcd.init();
  lcd.backlight();
  lcd.setCursor(4, 0);


  // lcd.print("Jarak: "); lcd.print(jarak); lcd.println(" cm");
  Serial.print("Jarak: "); Serial.print(jarak); Serial.println(" cm");
  delay(50);
  
  if(jarak <= 20) {
    for (int pos = 0; pos <= 180; pos++) {
      servo1.write(pos);
      // servo2.write(pos);
      delay(10);
    }

    delay(10);

    for (int pos = 180; pos >= 0; pos--){
      servo1.write(pos);
      // servo2.write(pos);
      delay(10);
    }
  }
  
}