CREATE TABLE recipe (
    id            BIGSERIAL PRIMARY KEY,
    title         VARCHAR(255) NOT NULL,
    description   TEXT,
    instructions  TEXT,
    created_at    TIMESTAMP NOT NULL DEFAULT now()
);