package com.domepack.webb.entity.enums;

public class UserAdminEnum {

	public enum UserFlag {

		USING("使用中", 1), PWDLOCK("密码锁定", 2), ERRORLOCK("异常锁定", 3),DISABLED("禁用",4),DEL("删除状态",5);

		// 防止字段值被修改，增加的字段也统一final表示常量
		private final String key;
		private final int value;

		private UserFlag(String key, int value) {
			this.key = key;
			this.value = value;
		}

		// 根据key获取枚举
		public static UserFlag getEnumByKey(String key) {
			if (null == key) {
				return null;
			}
			for (UserFlag temp : UserFlag.values()) {
				if (temp.getKey().equals(key)) {
					return temp;
				}
			}
			return null;
		}

		public String getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

	}

}
