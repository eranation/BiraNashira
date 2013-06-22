/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biranashira;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

/**
 *
 * @author ehrannm
 */
public class Model {

    public static final String PROP_SHOWSECONDMONITOR = "showSecondMonitor";
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private transient final VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);
    private boolean showSecondMonitor;

    public boolean isShowSecondMonitor() {
        return showSecondMonitor;
    }

    public void setShowSecondMonitor(boolean showSecondMonitor) throws java.beans.PropertyVetoException {
        boolean oldShowSecondMonitor = this.showSecondMonitor;
        vetoableChangeSupport.fireVetoableChange(PROP_SHOWSECONDMONITOR, oldShowSecondMonitor, showSecondMonitor);
        this.showSecondMonitor = showSecondMonitor;
        propertyChangeSupport.firePropertyChange(PROP_SHOWSECONDMONITOR, oldShowSecondMonitor, showSecondMonitor);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
