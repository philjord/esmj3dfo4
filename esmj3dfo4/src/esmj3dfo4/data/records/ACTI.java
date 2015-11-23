package esmj3dfo4.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class ACTI extends RECO
{
	public ZString EDID;

	public MODL MODL;

	public ACTI(Record recordData)
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
			else if (sr.getType().equals("FULL"))
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
			else if (sr.getType().equals("MODS"))
			{
				MODL.addMODSSub(bs);
			}

			else if (sr.getType().equals("PNAM"))
			{
			}
			else if (sr.getType().equals("FNAM"))
			{
			}
			else if (sr.getType().equals("VMAD"))
			{
			}
			else if (sr.getType().equals("KNAM"))
			{
			}

			else if (sr.getType().equals("DEST"))
			{
			}
			else if (sr.getType().equals("DSTD"))
			{
			}
			else if (sr.getType().equals("DMDL"))
			{
			}
			else if (sr.getType().equals("DMDT"))
			{
			}
			else if (sr.getType().equals("DMDS"))
			{
			}
			else if (sr.getType().equals("DSTF"))
			{
			}
			else if (sr.getType().equals("RNAM"))
			{
			}
			else if (sr.getType().equals("VNAM"))
			{
			}
			else if (sr.getType().equals("WNAM"))
			{
			}
			else if (sr.getType().equals("KSIZ"))
			{
			}
			else if (sr.getType().equals("KWDA"))
			{
			}
			else if (sr.getType().equals("SNAM"))
			{
			}
			else if (sr.getType().equals("PRPS"))
			{
				// new
			}
			else if (sr.getType().equals("RADR"))
			{
				// new
			}
			else if (sr.getType().equals("PTRN"))
			{
				// new
			}else if (sr.getType().equals("CTDA"))
			{
				//new
			}else if (sr.getType().equals("CITC"))
			{
				//new
			}else if (sr.getType().equals("STCP"))
			{
				//new
			}else if (sr.getType().equals("ATTX"))
			{
				//new
			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

		}
	}

}
