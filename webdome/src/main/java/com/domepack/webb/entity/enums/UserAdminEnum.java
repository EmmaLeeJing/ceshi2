package com.domepack.webb.entity.enums;

public class UserAdminEnum {

	public enum UserFlag {

		USING("ʹ����", 1), PWDLOCK("��������", 2), ERRORLOCK("�쳣����", 3),DISABLED("����",4),DEL("ɾ��״̬",5);

		// ��ֹ�ֶ�ֵ���޸ģ����ӵ��ֶ�Ҳͳһfinal��ʾ����
		private final String key;
		private final int value;

		private UserFlag(String key, int value) {
			this.key = key;
			this.value = value;
		}

		// ����key��ȡö��
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
