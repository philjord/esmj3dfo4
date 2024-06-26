package esmj3dfo4.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;


/**
 * https://falloutck.uesp.net/wiki/Acoustic_Space
 * 
 * names like ExtInteriorFakeInteriorBrickMedium, IntGenericB, ExtInteriorFakeInteriorMetalSmall
 */
public class ASPC extends RECO
{
	

	public ASPC(Record recordData)
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
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("SNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("ANAM"))
			{

			}else if (sr.getSubrecordType().equals("BNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("RDAT"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
