package esmj3dfo4.data.records;

import java.util.ArrayList;
import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo4.data.subrecords.LVLD;
import esmj3dfo4.data.subrecords.LVLF;
import esmj3dfo4.data.subrecords.LVLO;
/**
 * https://falloutck.uesp.net/wiki/LeveledSpell
 * The leveled spell is a collection of Spells. This seems to be an unused form type within the creation kit. Its usage is unknown and may affect the game in unexpected ways. 
 */

public class LVSP extends RECO
{
	public ZString EDID = null;

	public LVLD LVLD = null;

	public LVLF LVLF = null;

	public FormID SCRI = null;

	public FormID TNAM = null;

	public LVLO[] LVLOs = null;

	public LVSP(Record recordData)
	{
		super(recordData);

		ArrayList<LVLO> LVLOsl = new ArrayList<LVLO>();

		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("LVLD"))
			{
				LVLD = new LVLD(bs);
			}
			else if (sr.getSubrecordType().equals("LVLF"))
			{
				LVLF = new LVLF(bs);
			}
			else if (sr.getSubrecordType().equals("LVLO"))
			{
				LVLOsl.add(new LVLO(bs));
			}
			else if (sr.getSubrecordType().equals("LLCT"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

			// transfer to arrays
			LVLOs = new LVLO[LVLOsl.size()];
			LVLOsl.toArray(LVLOs);
		}
	}
}
