CREATE TABLE blog_t (
    blog_id SERIAL PRIMARY KEY,
    blog_content TEXT NOT NULL,
    created_by VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL
);
