package com.haulmont.addon.tour.web.gui.components.events.step_events;

import com.haulmont.addon.tour.web.gui.components.Step;

/**
 * Event class that contains information about showing.
 */
public class ShowEvent extends StepEvent {

    public ShowEvent(Step source) {
        super(source);
    }
}
