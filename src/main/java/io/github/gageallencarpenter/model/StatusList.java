package io.github.gageallencarpenter.model;

/**
 * StatusList allows the application to have a different status for each service's degree of
 * completion. Active is used to format the services that are currently running. Inactive is
 * used to format the services that are not currently running. Selected is used to format the
 * services that are selected to be handle. Unselected is used to format the services that were
 * selected to be handle but are no longer selected. Queued is used to format the services that
 * are queued to be handle. Rejected is used to format the services that were queued to be handle
 * but are no longer queued. Launched is used to format the services that are launched to be
 * handle. Complete is used to format the services that are complete.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public enum StatusList {
    ACTIVE, DONE, INACTIVE, SELECTED, UNSELECTED, QUEUED, EMPTY
}
