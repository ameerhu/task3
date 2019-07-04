/**
 */
package StateMachine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see StateMachine.StateMachinePackage
 * @generated
 */
public interface StateMachineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachineFactory eINSTANCE = StateMachine.impl.StateMachineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named State</em>'.
	 * @generated
	 */
	NamedState createNamedState();

	/**
	 * Returns a new object of class '<em>Un Named State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Un Named State</em>'.
	 * @generated
	 */
	UnNamedState createUnNamedState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Washing Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Washing Machine</em>'.
	 * @generated
	 */
	WashingMachine createWashingMachine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateMachinePackage getStateMachinePackage();

} //StateMachineFactory
