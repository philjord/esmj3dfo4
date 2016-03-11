package esmj3dfo4.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class WEAP extends RECO
{
	public ZString EDID;

	public FormID FULL;

	public MODL MODL;
	
	public MODL MOD4; // female  

	public WEAP(Record recordData)
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
				FULL = new FormID(bs);
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
			
			else if (sr.getType().equals("MOD4"))
			{
				MOD4 = new MODL(bs);
			}
			else if (sr.getType().equals("MO4T"))
			{
				MOD4.addMODTSub(bs);
			}
			else if (sr.getType().equals("MO4S"))
			{
				MOD4.addMODSSub(bs);
			}
			
			else if (sr.getType().equals("EITM"))
			{

			}
			else if (sr.getType().equals("EAMT"))
			{

			}
			else if (sr.getType().equals("ETYP"))
			{

			}
			else if (sr.getType().equals("BIDS"))
			{

			}
			else if (sr.getType().equals("BAMT"))
			{

			}
			else if (sr.getType().equals("KSIZ"))
			{

			}
			else if (sr.getType().equals("KWDA"))
			{

			}
			else if (sr.getType().equals("DESC"))
			{

			}
			else if (sr.getType().equals("INAM"))
			{

			}
			else if (sr.getType().equals("WNAM"))
			{

			}
			else if (sr.getType().equals("TNAM"))
			{

			}
			else if (sr.getType().equals("NAM9"))
			{

			}
			else if (sr.getType().equals("NAM8"))
			{

			}
			else if (sr.getType().equals("DATA"))
			{

			}
			else if (sr.getType().equals("DNAM"))
			{

			}
			else if (sr.getType().equals("CRDT"))
			{

			}
			else if (sr.getType().equals("VNAM"))
			{

			}
			else if (sr.getType().equals("CNAM"))
			{

			}
			else if (sr.getType().equals("VMAD"))
			{

			}
			else if (sr.getType().equals("SNAM"))
			{

			}
			else if (sr.getType().equals("UNAM"))
			{

			}
			else if (sr.getType().equals("NNAM"))
			{

			}
			else if (sr.getType().equals("PTRN"))
			{
				// new
			}else if (sr.getType().equals("OBTS"))
			{
				// new
			}else if (sr.getType().equals("OBTE"))
			{
				// new
			}else if (sr.getType().equals("OBTF"))
			{
				// new
			}else if (sr.getType().equals("YNAM"))
			{
				// new
			}
			else if (sr.getType().equals("ZNAM"))
			{
				// new
			}
			else if (sr.getType().equals("INRD"))
			{
				// new
			}
			else if (sr.getType().equals("APPR"))
			{
				// new
			}
			else if (sr.getType().equals("STOP"))
			{
				// new
			}
			else if (sr.getType().equals("FNAM"))
			{
				// new
			}
			else if (sr.getType().equals("LNAM"))
			{
				// new
			}
			else if (sr.getType().equals("WAMD"))
			{
				// new
			}
			else if (sr.getType().equals("WZMD"))
			{
				// new
			}
			else if (sr.getType().equals("DAMA"))
			{
				// new
			}
			else if (sr.getType().equals("MASE"))
			{
				// FO4
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

	public class DATA
	{
		public byte[] data;

		private DATA(byte[] bytes)
		{
			data = bytes;
		}
	}
}
