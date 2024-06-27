DO
$$
BEGIN
   IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'tecevents') THEN
      CREATE DATABASE tecevents;
   END IF;
END
$$;