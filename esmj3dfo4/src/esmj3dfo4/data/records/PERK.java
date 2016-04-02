package esmj3dfo4.data.records;

import java.util.List;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class PERK extends RECO
{

	public ZString EDID = null;

	public PERK(Record recordData)
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
			else if (sr.getSubrecordType().equals("FULL"))
			{

			}
			else if (sr.getSubrecordType().equals("DESC"))
			{

			}

			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			else if (sr.getSubrecordType().equals("PRKE"))
			{

			}
			else if (sr.getSubrecordType().equals("PRKF"))
			{

			}
			else if (sr.getSubrecordType().equals("PRKC"))
			{

			}
			else if (sr.getSubrecordType().equals("CTDA"))
			{

			}
			else if (sr.getSubrecordType().equals("EPFT"))
			{

			}
			else if (sr.getSubrecordType().equals("EPFD"))
			{

			}
			else if (sr.getSubrecordType().equals("EPF2"))
			{

			}
			else if (sr.getSubrecordType().equals("EPF3"))
			{

			}
			else if (sr.getSubrecordType().equals("CIS2"))
			{

			}
			else if (sr.getSubrecordType().equals("NNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("VMAD"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
