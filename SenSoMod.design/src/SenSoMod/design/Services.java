package SenSoMod.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.internal.query.DNodeContainerQuery;
import org.eclipse.sirius.diagram.ui.business.internal.view.LayoutData;
import org.eclipse.sirius.diagram.ui.business.internal.view.RootLayoutData;

import senSoMod.ComputedSensor;
import senSoMod.Context;
import senSoMod.ContextDescription;
import senSoMod.PhysicalSensor;
import senSoMod.VirtualSensor;

import org.eclipse.gef.EditPart;

/**
 * The services class used by VSM.
 */
public class Services {
    
	public Context setLocationOfContext(Context context, EObject pContextView, EObject pOutputView, EObject pDecisionLogicView) {
		//angepasst aus der Vorlage von https://bugs.eclipse.org/bugs/show_bug.cgi?id=508178
		
		
		AbstractDNode contextView = (AbstractDNode) pContextView;
		AbstractDNode outputView = (AbstractDNode) pOutputView;
		AbstractDNode decisionLogicView = (AbstractDNode) pDecisionLogicView;


        // Get the original data stored by the tool itself (mouse location and
        // optionally dimension)
        // Info: LayoutData is not API but it should be.
        LayoutData originalFeatureLayoutData = SiriusLayoutDataManager.INSTANCE.getData(contextView, true);
        // Compute dimension if not stored in layout data
        Dimension contextViewSize = originalFeatureLayoutData.getSize();
        // Info: RootLayoutData is not API but it should be or at least Sirius should provide an API no create a such LayoutData.
//        if (contextViewSize == null) {
//            // Use same code as AbstractCanonicalSynchronizer.getDefaultSize.
//            // Info: There is currently no API for this but is should be improve in
//            // Sirius itself.
//            if (contextView instanceof DNode) {
//            	contextViewSize = new DNodeQuery((DNode) contextView).getDefaultDimension();
//            } else if (contextView instanceof DNodeContainer) {
//            	contextViewSize = new DNodeContainerQuery((DNodeContainer) contextView).getDefaultDimension();
//            } else {
//            	contextViewSize = new Dimension(-1, -1);
//
//            }
//        }
        //egal ob Element mit Drag and Drop oder 1 Click erzeugt wird
        //force Size to 400 Breite und 450 Höhe
        contextViewSize = new Dimension(400, 550);
    	RootLayoutData newFeatureLayoutData = new RootLayoutData(contextView,originalFeatureLayoutData.getLocation(), contextViewSize);

        // Add layout data for feature view (the previous original data will be
        // considered has already consumed so this new layout will be used).
        SiriusLayoutDataManager.INSTANCE.addData(newFeatureLayoutData);
        // Compute y location: middle of the container - 5 pixels (because the
        // port has a size of 10 pixels)
        //int yCoordinate = (contextViewSize.height / 2) - 5;
        //System.out.println(yCoordinate);
        // Add layout data for outputView 
       SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(outputView, new Point(10, 185), null));

        // Add layout data for DecisonLogicView 
        SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(decisionLogicView, new Point(10, 350), null));
        
       

        return context;
    }
	
	public ContextDescription setLocationOfContextDesc(ContextDescription contextDesc, EObject pContextDescriptionView, EObject pContextExpressionView) {
	
		
		AbstractDNode contextDescriptionView = (AbstractDNode) pContextDescriptionView;
		AbstractDNode contextExpressionView = (AbstractDNode) pContextExpressionView;

        LayoutData originalFeatureLayoutData = SiriusLayoutDataManager.INSTANCE.getData(contextDescriptionView, true);
        Dimension contextDescriptionViewSize = originalFeatureLayoutData.getSize();

        contextDescriptionViewSize = new Dimension(500, 300);
    	RootLayoutData newFeatureLayoutData = new RootLayoutData(contextDescriptionView,originalFeatureLayoutData.getLocation(), contextDescriptionViewSize);

        SiriusLayoutDataManager.INSTANCE.addData(newFeatureLayoutData);

       SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(contextExpressionView, new Point(70, 90), null));


        return contextDesc;
    }
	
	public PhysicalSensor setLocationOfPhysicalSensor(PhysicalSensor physicalSensor, EObject pPhysicalSensorView, EObject pOutputView) {
	
		
		AbstractDNode physicalSensorView = (AbstractDNode) pPhysicalSensorView;
		AbstractDNode outputView = (AbstractDNode) pOutputView;

        LayoutData originalFeatureLayoutData = SiriusLayoutDataManager.INSTANCE.getData(physicalSensorView, true);
        Dimension physicalSensorViewSize = originalFeatureLayoutData.getSize();

        physicalSensorViewSize = new Dimension(400, 400);
    	RootLayoutData newFeatureLayoutData = new RootLayoutData(physicalSensorView,originalFeatureLayoutData.getLocation(), physicalSensorViewSize);

        SiriusLayoutDataManager.INSTANCE.addData(newFeatureLayoutData);

       SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(outputView, new Point(40, 130), null));


        return physicalSensor;
    }
	
public VirtualSensor setLocationOfVirtualSensor(VirtualSensor physicalSensor, EObject pPhysicalSensorView, EObject pOutputView) {
	
		
		AbstractDNode physicalSensorView = (AbstractDNode) pPhysicalSensorView;
		AbstractDNode outputView = (AbstractDNode) pOutputView;

        LayoutData originalFeatureLayoutData = SiriusLayoutDataManager.INSTANCE.getData(physicalSensorView, true);
        Dimension physicalSensorViewSize = originalFeatureLayoutData.getSize();

        physicalSensorViewSize = new Dimension(400, 400);
    	RootLayoutData newFeatureLayoutData = new RootLayoutData(physicalSensorView, originalFeatureLayoutData.getLocation(), physicalSensorViewSize);

        SiriusLayoutDataManager.INSTANCE.addData(newFeatureLayoutData);

       SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(outputView, new Point(40, 130), null));


        return physicalSensor;
    }

	public ComputedSensor setLocationOfComputedSensor(ComputedSensor computedSensor, EObject pComputedSensorView, EObject pOutputView, EObject pDecisionLogicView) {
	
		AbstractDNode computedSensorView =  (AbstractDNode) pComputedSensorView;
		DNodeContainer outputView = (DNodeContainer) pOutputView;
		AbstractDNode decisionLogicView = (AbstractDNode) pDecisionLogicView;

        LayoutData originalFeatureLayoutData = SiriusLayoutDataManager.INSTANCE.getData(computedSensorView, true);
        Dimension computedSensorViewSize = originalFeatureLayoutData.getSize();

        computedSensorViewSize = new Dimension(400, 550);
    	RootLayoutData newFeatureLayoutData = new RootLayoutData(computedSensorView,originalFeatureLayoutData.getLocation(), computedSensorViewSize);


        SiriusLayoutDataManager.INSTANCE.addData(newFeatureLayoutData);
        
        SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(outputView, new Point(10, 350), null));

        SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(decisionLogicView, new Point(10, 185), null));

        
       

        return computedSensor;
	}


}
