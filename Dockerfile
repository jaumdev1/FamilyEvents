# Use a imagem oficial do PostgreSQL
FROM postgres:latest

# Copie o script de inicialização para o diretório de inicialização do PostgreSQL
COPY init.sql /docker-entrypoint-initdb.d/

# As variáveis de ambiente para o PostgreSQL
ENV POSTGRES_DB tecevents
ENV POSTGRES_USER admin
ENV POSTGRES_PASSWORD 1234

EXPOSE 5432