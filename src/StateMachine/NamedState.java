/**
 */
package StateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StateMachine.NamedState#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see StateMachine.StateMachinePackage#getNamedState()
 * @model
 * @generated
 */
public interface NamedState extends State {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StateMachine.StateMachinePackage#getNamedState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StateMachine.NamedState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedState
