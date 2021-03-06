package org.openmrs.module.openhmis.inventory.web;

import org.openmrs.module.openhmis.inventory.api.util.PrivilegeConstants;

public class PrivilegeWebConstants extends PrivilegeConstants {
	public static final String ROLE_CREATION_PAGE_PRIVILEGES = org.openmrs.util.PrivilegeConstants.MANAGE_ROLES;
	public static final String ITEM_PAGE_PRIVILEGES = MANAGE_ITEMS + ", " + VIEW_ITEMS;
	public static final String DEPARTMENT_PAGE_PRIVILEGES = MANAGE_METADATA + ", " + VIEW_METADATA;
	public static final String STOCKROOM_PAGE_PRIVILEGES = MANAGE_STOCKROOMS + ", " + VIEW_STOCKROOMS;
	public static final String INSTITUTION_PAGE_PRIVILEGES = MANAGE_METADATA + ", " + VIEW_METADATA;
	public static final String OPERATION_TYPES_PAGE_PRIVILEGES = MANAGE_METADATA + ", " + VIEW_METADATA;
	public static final String OPERATIONS_PAGE_PRIVILEGES = VIEW_OPERATIONS;
	public static final String ITEM_CONCEPT_SUGGESTION_PAGE_PRIVILEGES = MANAGE_ITEMS + ", " + VIEW_ITEMS;
	public static final String INVENTORY_PAGE_PRIVILEGES = MANAGE_OPERATIONS + ", " + VIEW_OPERATIONS;
	public static final String SETTINGS_PAGE_PRIVILEGES = MANAGE_METADATA;

	protected PrivilegeWebConstants() { }
}
