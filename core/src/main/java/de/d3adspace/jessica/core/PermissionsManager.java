package de.d3adspace.jessica.core;

import de.d3adspace.jessica.core.user.PermissionsUser;

import java.util.UUID;

/**
 * The permission manager that will provide an API for operations on permissions data, users & groups.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface PermissionsManager {

    /**
     * Get the unique id of the user.
     *
     * @param uniqueId The unique id.
     * @return The user.
     */
    PermissionsUser getUser(UUID uniqueId);
}
