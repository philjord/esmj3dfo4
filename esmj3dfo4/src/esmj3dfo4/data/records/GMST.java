package esmj3dfo4.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;
/**
 * NOT FOUND IN https://falloutck.uesp.net/wiki/Object_Class_List possibly delete
 * 
 */
public class GMST extends RECO
{

	public ZString EDID = null;

	public GMST(Record recordData)
	{
		super(recordData);
		System.out.println("GMST NOT FOUND IN https://falloutck.uesp.net/wiki/Object_Class_List possibly delete");
		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
