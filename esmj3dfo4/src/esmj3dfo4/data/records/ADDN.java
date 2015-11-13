package esmj3dfo4.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class ADDN extends RECO
{

	public ZString EDID = null;

	public MODL MODL;

	public ADDN(Record recordData)
	{
		super(recordData);
		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getData();

			if (sr.getType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}

			else if (sr.getType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}

			else if (sr.getType().equals("SNAM"))
			{

			}
			else if (sr.getType().equals("DATA"))
			{

			}

			else if (sr.getType().equals("DNAM"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
