package esmj3dfo4.data.subrecords;

import tools.io.ESMByteConvert;

public class LVLD
{
	public byte chanceNone;

	public LVLD(byte[] bytes)
	{
		chanceNone = ESMByteConvert.extractByte(bytes, 0);
	}
}
