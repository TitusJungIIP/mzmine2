/*
 * Copyright 2006-2008 The MZmine Development Team
 * 
 * This file is part of MZmine.
 * 
 * MZmine is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * MZmine is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * MZmine; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */


package net.sf.mzmine.modules.peakpicking.twostep.peakconstruction;

import java.util.Vector;

import net.sf.mzmine.data.Peak;
import net.sf.mzmine.data.RawDataFile;
import net.sf.mzmine.data.Scan;
import net.sf.mzmine.modules.peakpicking.twostep.massdetection.MzPeak;
import net.sf.mzmine.modules.peakpicking.twostep.peakconstruction.simpleconnector.ConnectedPeak;

public interface PeakBuilder {

    
    /**
     * 
     */
    public Peak[] addScan(Scan scan, MzPeak[] mzValues, Vector<ConnectedPeak> ucPeak, RawDataFile dataFile);
    
    public Peak[] finishPeaks(Vector<ConnectedPeak> underConstructionPeaks);
    
}