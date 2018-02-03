package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ElectronicShopKeyBoardUSB {
	static int electronicShop(int money, int[] keyBoardArr, int[] usbArr) {
		int sum = 0;
		int temp = 0;
		int monicaMaxSum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < keyBoardArr.length; i++) {
			for (int j = 0; j < usbArr.length; j++) {
				sum = keyBoardArr[i] + usbArr[j];
				// System.out.println(sum);
				list.add(sum);
			}

		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) <= money) {
				monicaMaxSum = list.get(i);
				temp++;
			} else if (list.get(i) > money && temp == 0) {
				monicaMaxSum = -1;
			}
		}
		return monicaMaxSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int keyBoard = sc.nextInt();
		int usb = sc.nextInt();
		int[] keyBoardArr = new int[keyBoard];
		int[] usbArr = new int[usb];
		for (int i = 0; i < keyBoard; i++) {
			keyBoardArr[i] = sc.nextInt();
		}
		for (int i = 0; i < usb; i++) {
			usbArr[i] = sc.nextInt();
		}
		int result = electronicShop(money, keyBoardArr, usbArr);
		System.out.println(result);
		sc.close();
	}

}
