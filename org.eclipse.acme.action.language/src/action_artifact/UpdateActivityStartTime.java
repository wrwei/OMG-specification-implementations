/**
 */
package action_artifact;

import action_base.Update;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Activity Start Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.UpdateActivityStartTime#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getUpdateActivityStartTime()
 * @model
 * @generated
 */
public interface UpdateActivityStartTime extends Update {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see action_artifact.Action_artifactPackage#getUpdateActivityStartTime_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link action_artifact.UpdateActivityStartTime#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

} // UpdateActivityStartTime
