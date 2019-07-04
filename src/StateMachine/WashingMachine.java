/**
 */
package StateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Washing Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StateMachine.WashingMachine#getStates <em>States</em>}</li>
 *   <li>{@link StateMachine.WashingMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see StateMachine.StateMachinePackage#getWashingMachine()
 * @model
 * @generated
 */
public interface WashingMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachine.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see StateMachine.StateMachinePackage#getWashingMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see StateMachine.StateMachinePackage#getWashingMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // WashingMachine
