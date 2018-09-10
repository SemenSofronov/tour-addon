package com.haulmont.addon.tour.web.gui.components.events.step_events;

import com.haulmont.addon.tour.web.gui.components.Step;

/**
 * Event class that contains information about hiding.
 */
public class HideEvent extends StepEvent {

    public HideEvent(Step source) {
        super(source);
    }
}