package org.phone;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("Phone Name:Iphone");

	}
	public void phoneImeiNum() {
    System.out.println("Imei num:3456789");

	}
	public void Camera() {
		System.out.println("Camera:8 Megapixel Rear");
	}
   
	public void storage() {
		System.out.println("Storage:4GB");

	}
	public void osName() {
		System.out.println("OS Name: MAC");

	}
	public static void main(String[] args) {
		PhoneInfo ph=new PhoneInfo();
		ph.phoneName();
		ph.phoneImeiNum();
		ph.osName();
	}
}
