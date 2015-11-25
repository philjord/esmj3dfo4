package esmj3dfo4.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class TERM extends RECO
{

	public ZString EDID = null;

	public LString FULL = null;

	public MODL MODL = null;

	public TERM(Record recordData)
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
			else if (sr.getType().equals("FULL"))
			{
				FULL = new LString(bs);
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
			else if (sr.getType().equals("RNAM"))
			{

			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("DNAM"))
			{

			}
			else if (sr.getType().equals("PNAM"))
			{

			}
			else if (sr.getType().equals("ANAM"))
			{

			}
			else if (sr.getType().equals("DESC"))
			{

			}
			else if (sr.getType().equals("SCHR"))
			{

			}
			else if (sr.getType().equals("ITXT"))
			{

			}
			else if (sr.getType().equals("INAM"))
			{

			}
			else if (sr.getType().equals("CTDA"))
			{

			}
			else if (sr.getType().equals("TNAM"))
			{

			}
			else if (sr.getType().equals("SCDA"))
			{

			}
			else if (sr.getType().equals("SCTX"))
			{

			}
			else if (sr.getType().equals("SCRO"))
			{

			}
			else if (sr.getType().equals("SCRI"))
			{

			}
			else if (sr.getType().equals("SCRV"))
			{

			}
			else if (sr.getType().equals("SCVR"))
			{

			}
			else if (sr.getType().equals("SLSD"))
			{

			}
			//FALLOUTNV only ////////////////////////////
			else if (sr.getType().equals("MODS"))
			{

			}
			else if (sr.getType().equals("WNAM"))
			{
				// new
			}
			else if (sr.getType().equals("KSIZ"))
			{
				// new
			}
			else if (sr.getType().equals("KWDA"))
			{
				// new
			}
			else if (sr.getType().equals("FNAM"))
			{
				// new
			}
			else if (sr.getType().equals("COCT"))
			{
				// new
			}
			else if (sr.getType().equals("CNTO"))
			{
				// new
			}
			else if (sr.getType().equals("MNAM"))
			{
				// new
			}
			else if (sr.getType().equals("WNAM"))
			{
				// new
			}
			else if (sr.getType().equals("WBDT"))
			{
				// new
			}
			else if (sr.getType().equals("XMRK"))
			{
				// new
			}
			else if (sr.getType().equals("BSIZ"))
			{
				// new
			}
			else if (sr.getType().equals("ISIZ"))
			{
				// new
			}
			else if (sr.getType().equals("ITID"))
			{
				// new
			}
			else if (sr.getType().equals("UNAM"))
			{
				// new
			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
