package esmj3dfo4.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;
/**
 * https://falloutck.uesp.net/wiki/Music_Track
 */
public class MUST extends RECO
{
	public ZString EDID;

	public MUST(Record recordData)
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
			else if (sr.getSubrecordType().equals("CNAM")){}
			else if (sr.getSubrecordType().equals("ANAM")){}
			else if (sr.getSubrecordType().equals("BNAM")){}
			else if (sr.getSubrecordType().equals("FNAM")){}
			else if (sr.getSubrecordType().equals("CITC")){}
			else if (sr.getSubrecordType().equals("CTDA")){}
			else if (sr.getSubrecordType().equals("FLTV")){}
			else if (sr.getSubrecordType().equals("LNAM")){}
			else if (sr.getSubrecordType().equals("DNAM")){}
			else if (sr.getSubrecordType().equals("SNAM")){}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
