package testMimic;

import jp.nyatla.mimic.mbedjs.javaapi.*;


public class mainproc{
	public static void main(String args[]){
		try {
			Mcu mcu=new Mcu("10.0.0.2");
			
			TextLCD lcd = new TextLCD(mcu , PinName.p24, PinName.p26,
					PinName.p27, PinName.p28, PinName.p29, PinName.p30,LCDType.LCD16x2);
			
			lcd.putc('T');
			lcd.putc('E');
			lcd.putc('S');
			lcd.putc('T');
		
			mcu.close();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
