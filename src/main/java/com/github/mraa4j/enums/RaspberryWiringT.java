package com.github.mraa4j.enums;

import java.util.EnumSet;

public enum RaspberryWiringT {
	MRAA_RASPBERRY_WIRING_PIN8(3),
	MRAA_RASPBERRY_WIRING_PIN9(5),
	MRAA_RASPBERRY_WIRING_PIN7(7),
	MRAA_RASPBERRY_WIRING_PIN15(8),
	MRAA_RASPBERRY_WIRING_PIN16(10),
	MRAA_RASPBERRY_WIRING_PIN0(11),
	MRAA_RASPBERRY_WIRING_PIN1(12),
	MRAA_RASPBERRY_WIRING_PIN2(13),
	MRAA_RASPBERRY_WIRING_PIN3(15),
	MRAA_RASPBERRY_WIRING_PIN4(16),
	MRAA_RASPBERRY_WIRING_PIN5(18),
	MRAA_RASPBERRY_WIRING_PIN12(19),
	MRAA_RASPBERRY_WIRING_PIN13(21),
	MRAA_RASPBERRY_WIRING_PIN6(22),
	MRAA_RASPBERRY_WIRING_PIN14(23),
	MRAA_RASPBERRY_WIRING_PIN10(24),
	MRAA_RASPBERRY_WIRING_PIN11(26),
	MRAA_RASPBERRY_WIRING_PIN17(29),
	MRAA_RASPBERRY_WIRING_PIN21(29),
	MRAA_RASPBERRY_WIRING_PIN18(30),
	MRAA_RASPBERRY_WIRING_PIN19(31),
	MRAA_RASPBERRY_WIRING_PIN22(31),
	MRAA_RASPBERRY_WIRING_PIN20(32),
	MRAA_RASPBERRY_WIRING_PIN26(32),
	MRAA_RASPBERRY_WIRING_PIN23(33),
	MRAA_RASPBERRY_WIRING_PIN24(35),
	MRAA_RASPBERRY_WIRING_PIN27(36),
	MRAA_RASPBERRY_WIRING_PIN25(37),
	MRAA_RASPBERRY_WIRING_PIN28(38),
	MRAA_RASPBERRY_WIRING_PIN29(40);

	private int value;

	private RaspberryWiringT(int v) {
		value = v;
	}

	public int getValue() {
		return value;
	}

	static public RaspberryWiringT fromValue(int v) {
		EnumSet<RaspberryWiringT> allEnums = EnumSet.allOf(RaspberryWiringT.class);
		for (RaspberryWiringT elem : allEnums) {
			if (elem.getValue() == v) {
				return elem;
			}
		}
		return null;
	}

}
