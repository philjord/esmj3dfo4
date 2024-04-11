package esmj3dfo4.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
/**
 * NOT FOUND IN https://falloutck.uesp.net/wiki/Object_Class_List possibly delete
 * 
 */
public class SLGM extends RECO
{
	public ZString EDID;
	public MODL MODL;

	public SLGM(Record recordData)
	{
		super(recordData);
		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("OBND")){}
			else if (sr.getSubrecordType().equals("FULL")){}
			else if (sr.getSubrecordType().equals("MODL")){
				MODL = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MODT")){}
			else if (sr.getSubrecordType().equals("KSIZ")){}
			else if (sr.getSubrecordType().equals("KWDA")){}
			else if (sr.getSubrecordType().equals("DATA")){}
			else if (sr.getSubrecordType().equals("SOUL")){}
			else if (sr.getSubrecordType().equals("SLCP")){}
			else if (sr.getSubrecordType().equals("NAM0")){}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
