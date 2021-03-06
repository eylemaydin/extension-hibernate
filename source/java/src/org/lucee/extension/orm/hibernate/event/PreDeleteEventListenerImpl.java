package org.lucee.extension.orm.hibernate.event;

import lucee.runtime.Component;

import org.hibernate.event.PreDeleteEvent;
import org.hibernate.event.PreDeleteEventListener;
import org.lucee.extension.orm.hibernate.CommonUtil;

public class PreDeleteEventListenerImpl extends EventListener implements PreDeleteEventListener {

	private static final long serialVersionUID = 1730085093470940646L;

	public PreDeleteEventListenerImpl(Component component) {
	    super(component, CommonUtil.PRE_DELETE, false);
	}

    @Override
	public boolean onPreDelete(PreDeleteEvent event) {
    	invoke(CommonUtil.PRE_DELETE, event.getEntity());
		return false;
    }

}
