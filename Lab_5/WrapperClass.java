import java.util.*;	
public class WrapperClass{
	public static void main(String args[]){

	Integer i= Integer.valueOf(45);
	int iw=i.intValue();
	System.out.println("Unwrapped int: "+ iw);

	Byte b=12;
	byte bw=b.byteValue();
	System.out.println("Unwrapped byte: " + bw);

	Double d=14.75;
	double dw=d.doubleValue();
	System.out.println("Unwrapped double: " + dw);

	Float f=23.66f;
	float fw=f.floatValue();
	System.out.println("Unwrapped float: "+ fw);
	
	Boolean bo= true;
	boolean bow=bo.booleanValue();
	System.out.println("Unwrapped bool: " + bow);
	
	Long l=10L;
	long lw=l.longValue();
	System.out.println("Unwrapped long: " + lw);
	
	Character c='X';
	char cw=c.charValue();
	System.out.println("Unwrapped char: " + cw);

	Short s=14;
	short sw=s.shortValue();
	System.out.println("Unwrapped short: " + sw);
	}
}