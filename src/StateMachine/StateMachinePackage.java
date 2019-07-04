/**
 */
package StateMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see StateMachine.StateMachineFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StateMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.hs-fulda.de";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Talha";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinePackage eINSTANCE = StateMachine.impl.StateMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link StateMachine.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachine.State
	 * @see StateMachine.impl.StateMachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGS = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StateMachine.impl.NamedStateImpl <em>Named State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachine.impl.NamedStateImpl
	 * @see StateMachine.impl.StateMachinePackageImpl#getNamedState()
	 * @generated
	 */
	int NAMED_STATE = 1;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STATE__OUTGOINGS = STATE__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STATE__NAME = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachine.impl.UnNamedStateImpl <em>Un Named State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachine.impl.UnNamedStateImpl
	 * @see StateMachine.impl.StateMachinePackageImpl#getUnNamedState()
	 * @generated
	 */
	int UN_NAMED_STATE = 2;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_NAMED_STATE__OUTGOINGS = STATE__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_NAMED_STATE__NAME = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Un Named State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_NAMED_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Un Named State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_NAMED_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link StateMachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachine.impl.TransitionImpl
	 * @see StateMachine.impl.StateMachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link StateMachine.impl.WashingMachineImpl <em>Washing Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see StateMachine.impl.WashingMachineImpl
	 * @see StateMachine.impl.StateMachinePackageImpl#getWashingMachine()
	 * @generated
	 */
	int WASHING_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Washing Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Washing Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link StateMachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see StateMachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link StateMachine.State#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoings</em>'.
	 * @see StateMachine.State#getOutgoings()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoings();

	/**
	 * Returns the meta object for class '{@link StateMachine.NamedState <em>Named State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named State</em>'.
	 * @see StateMachine.NamedState
	 * @generated
	 */
	EClass getNamedState();

	/**
	 * Returns the meta object for the attribute '{@link StateMachine.NamedState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StateMachine.NamedState#getName()
	 * @see #getNamedState()
	 * @generated
	 */
	EAttribute getNamedState_Name();

	/**
	 * Returns the meta object for class '{@link StateMachine.UnNamedState <em>Un Named State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Named State</em>'.
	 * @see StateMachine.UnNamedState
	 * @generated
	 */
	EClass getUnNamedState();

	/**
	 * Returns the meta object for the attribute '{@link StateMachine.UnNamedState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StateMachine.UnNamedState#getName()
	 * @see #getUnNamedState()
	 * @generated
	 */
	EAttribute getUnNamedState_Name();

	/**
	 * Returns the meta object for class '{@link StateMachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see StateMachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link StateMachine.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see StateMachine.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Action();

	/**
	 * Returns the meta object for the attribute '{@link StateMachine.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see StateMachine.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Trigger();

	/**
	 * Returns the meta object for the reference '{@link StateMachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see StateMachine.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link StateMachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see StateMachine.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link StateMachine.Transition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see StateMachine.Transition#getId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Id();

	/**
	 * Returns the meta object for the attribute '{@link StateMachine.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see StateMachine.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link StateMachine.WashingMachine <em>Washing Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Washing Machine</em>'.
	 * @see StateMachine.WashingMachine
	 * @generated
	 */
	EClass getWashingMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachine.WashingMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see StateMachine.WashingMachine#getStates()
	 * @see #getWashingMachine()
	 * @generated
	 */
	EReference getWashingMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link StateMachine.WashingMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see StateMachine.WashingMachine#getTransitions()
	 * @see #getWashingMachine()
	 * @generated
	 */
	EReference getWashingMachine_Transitions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineFactory getStateMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link StateMachine.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachine.State
		 * @see StateMachine.impl.StateMachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOINGS = eINSTANCE.getState_Outgoings();

		/**
		 * The meta object literal for the '{@link StateMachine.impl.NamedStateImpl <em>Named State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachine.impl.NamedStateImpl
		 * @see StateMachine.impl.StateMachinePackageImpl#getNamedState()
		 * @generated
		 */
		EClass NAMED_STATE = eINSTANCE.getNamedState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_STATE__NAME = eINSTANCE.getNamedState_Name();

		/**
		 * The meta object literal for the '{@link StateMachine.impl.UnNamedStateImpl <em>Un Named State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachine.impl.UnNamedStateImpl
		 * @see StateMachine.impl.StateMachinePackageImpl#getUnNamedState()
		 * @generated
		 */
		EClass UN_NAMED_STATE = eINSTANCE.getUnNamedState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UN_NAMED_STATE__NAME = eINSTANCE.getUnNamedState_Name();

		/**
		 * The meta object literal for the '{@link StateMachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachine.impl.TransitionImpl
		 * @see StateMachine.impl.StateMachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ID = eINSTANCE.getTransition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link StateMachine.impl.WashingMachineImpl <em>Washing Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see StateMachine.impl.WashingMachineImpl
		 * @see StateMachine.impl.StateMachinePackageImpl#getWashingMachine()
		 * @generated
		 */
		EClass WASHING_MACHINE = eINSTANCE.getWashingMachine();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WASHING_MACHINE__STATES = eINSTANCE.getWashingMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WASHING_MACHINE__TRANSITIONS = eINSTANCE.getWashingMachine_Transitions();

	}

} //StateMachinePackage
