package esmj3dfo4.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.OBND;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo4.data.shared.subrecords.KeyWords;
/**
 * https://falloutck.uesp.net/wiki/MiscItem
 */
public class MISC extends RECO
{
	

	public OBND OBND;

	public FormID FULL;

	public MODL MODL;

	public DATA DATA;

	public String ICON;

	public String MICO;

	public FormID YNAM;

	public FormID ZNAM;

	public KeyWords keyWords = new KeyWords();

	public MISC(Record recordData)
	{
		super(recordData);

		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				setEDID(bs);
			}
			else if (sr.getSubrecordType().equals("VMAD"))
			{

			}
			else if (sr.getSubrecordType().equals("OBND"))
			{
				OBND = new OBND(bs);
			}
			else if (sr.getSubrecordType().equals("FULL"))
			{
				FULL = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("MODS"))
			{
				MODL.addMODSSub(bs);
			}
			else if (sr.getSubrecordType().equals("ICON"))
			{
				ICON = ZString.toString(bs);
			}
			else if (sr.getSubrecordType().equals("MICO"))
			{
				MICO = ZString.toString(bs);
			}
			else if (sr.getSubrecordType().equals("DEST"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTD"))
			{

			}
			else if (sr.getSubrecordType().equals("DMDL"))
			{

			}
			else if (sr.getSubrecordType().equals("DMDT"))
			{

			}
			else if (sr.getSubrecordType().equals("DMDS"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTF"))
			{

			}
			else if (sr.getSubrecordType().equals("YNAM"))
			{
				YNAM = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("ZNAM"))
			{
				ZNAM = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("KSIZ"))
			{
				keyWords.setKSIZ(bs);
			}
			else if (sr.getSubrecordType().equals("KWDA"))
			{
				keyWords.setKWDA(bs);
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getSubrecordType().equals("CVPA"))
			{
				// new
			}
			else if (sr.getSubrecordType().equals("PTRN"))
			{
				// new
			}
			else if (sr.getSubrecordType().equals("CDIX"))
			{
				// new
			}
			else if (sr.getSubrecordType().equals("FIMD"))
			{
				// new
			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

	@Override
	public String showDetails()
	{
		return super.showDetails() + " : " + MODL.model;
	}

	public class DATA
	{
		public byte[] data;

		private DATA(byte[] bytes)
		{
			data = bytes;
		}
	}
}
