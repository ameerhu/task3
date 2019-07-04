/**
 */
package StateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StateMachine.State#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 *
 * @see StateMachine.StateMachinePackage#getState()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' reference list.
	 * The list contents are of type {@link StateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoings</em>' reference list.
	 * @see StateMachine.StateMachinePackage#getState_Outgoings()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoings();

} // State
