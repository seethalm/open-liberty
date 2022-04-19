CREATE TABLE ${schemaname}.ct_override_entity_b (entity_b_ct_entity_b INTEGER, ct_b_override_value INTEGER, value2 INTEGER, ct_b_override_nested_value INTEGER, nested_value2 INTEGER);
CREATE TABLE ${schemaname}.override_entity_b (b_id INTEGER NOT NULL, PRIMARY KEY (b_id));
CREATE INDEX I_CT_VY_B_ENTITY_B_CT_ENTITY_B ON ${schemaname}.ct_override_entity_b (entity_b_ct_entity_b);