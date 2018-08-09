package com.setyrobotics.arduinoeditor.node;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import de.tesis.dynaware.grapheditor.model.GConnector;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;

public class ComponentNode implements GNode {

	private GNode node;

	public ComponentNode(GNode node) {
		this.node = node;
	}

	@Override
	public EList<GConnector> getConnectors() {
		return node.getConnectors();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return node.eAllContents();
	}

	@Override
	public EClass eClass() {
		return node.eClass();
	}

	@Override
	public EObject eContainer() {
		return node.eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return node.eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return node.eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eInvoke(EOperation arg0, EList<?> arg1) throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eIsSet(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eUnset(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eNotify(Notification arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eSetDeliver(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setType(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWidth(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setHeight(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GModel getSubgraph() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSubgraph(GModel value) {
		// TODO Auto-generated method stub
		
	}

}
