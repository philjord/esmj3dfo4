package esmj3dfo4.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;

/**
 * Idle animations
 * not found in https://falloutck.uesp.net/wiki/Object_Class_List
 * But in the esm file
 */
public class IDLE extends RECO
{
	

	public IDLE(Record recordData)
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
			else if (sr.getSubrecordType().equals("CTDA"))
			{

			}
			else if (sr.getSubrecordType().equals("ANAM"))
			{

			}
			else if (sr.getSubrecordType().equals("ENAM"))
			{

			}
			else if (sr.getSubrecordType().equals("DNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			else if (sr.getSubrecordType().equals("CIS1"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
