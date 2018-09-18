package com.domepack.webb.untils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	

	
	static SimpleDateFormat formatter = null;
	/**
	 * ����string���͵�����
	 * @return
	 */
	public static String  getFormatCurrentDate(String moudle){
		
		formatter = new SimpleDateFormat(moudle);
		
		return formatter.format(new Date());
	}
	
	    public static String getNewEquipmentNo(String equipmentType, String equipmentNo){
	        String newEquipmentNo = "00001";
	 
	        if(equipmentNo != null && !equipmentNo.isEmpty()){
	            int newEquipment = Integer.parseInt(equipmentNo) + 1;
	            newEquipmentNo = String.format(equipmentType + "%05d", newEquipment);
	        }
	 
	        return newEquipmentNo;
	    }
	 
	    public static void main(String[] args) {
	        String equipmentNo = DateUtils.getNewEquipmentNo("SYXH", "00032");
	        System.out.println("�����豸��ţ�" + equipmentNo);
	    }
	 
}
