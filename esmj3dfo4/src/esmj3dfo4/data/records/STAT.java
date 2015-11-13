package esmj3dfo4.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.MODS;
import esmj3d.data.shared.subrecords.MODT;
import esmj3d.data.shared.subrecords.OBND;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class STAT extends RECO
{
	public ZString EDID;

	public OBND OBND;

	public MODL MODL;

	public MODT MODT;

	public MODS MODS;

	public String lodModel1 = null;//high detail

	public String lodModel2 = null;

	public String lodModel3 = null;

	public String lodModel4 = null;//low detail

	public STAT(Record recordData)
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
				OBND = new OBND(bs);
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
			else if (sr.getType().equals("DNAM"))
			{

			}
			else if (sr.getType().equals("MNAM"))
			{
				if (bs.length >= 1040)
				{
					//Has Distance LOD = RECO.VisibleWhenDistant_Flag from flags1
					lodModel1 = new String(bs, 0, 260).split("\0", 2)[0];
					lodModel2 = new String(bs, 260, 260).split("\0", 2)[0];
					lodModel3 = new String(bs, 520, 260).split("\0", 2)[0];
					lodModel4 = new String(bs, 780, 260).split("\0", 2)[0];
				}
				else
				{
					System.out.println("short MNAM in STAT ? " + new String(bs));
				}
			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}
		}
	}

	public String showDetails()
	{
		return "STAT : (" + formId + "|" + Integer.toHexString(formId) + ") " + EDID.str + " : " + MODL.model.str;
	}

}
