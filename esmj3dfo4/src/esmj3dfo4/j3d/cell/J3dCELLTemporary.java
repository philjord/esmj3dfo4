package esmj3dfo4.j3d.cell;

import java.util.Iterator;
import java.util.List;

import esfilemanager.common.data.record.IRecordStore;
import esfilemanager.common.data.record.Record;
import esmj3d.j3d.cell.J3dCELLGeneral;
import esmj3d.j3d.j3drecords.inst.J3dLAND;
import esmj3d.j3d.j3drecords.inst.J3dRECOInst;
import utils.source.MediaSources;

public class J3dCELLTemporary extends J3dCELL
{

	public J3dCELLTemporary(IRecordStore master, Record cellRecord, int worldId, List<Record> children, boolean makePhys, MediaSources mediaSources)
	{
		super(master, cellRecord, worldId, makePhys, mediaSources);
		indexRecords(children);

	}

	private void indexRecords(List<Record> children)
	{
		for (Iterator<Record> i = children.iterator(); i.hasNext();)
		{
			while(J3dCELLGeneral.PAUSE_CELL_LOADING) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {					
				}
			}
			
			Record record = i.next();
			J3dRECOInst jri = makeJ3dRECO(record);
			addJ3dRECOInst(jri);

			if (jri instanceof J3dLAND)
			{
				J3dLAND l = (J3dLAND) jri;
				float wl = getWaterLevel(cell.XCLW);
				if (wl > l.getLowestHeight())
				{
					addChild(makeWater(wl, J3dCELLPersistent.waterApp));
				}
			}

		}
	}
}
