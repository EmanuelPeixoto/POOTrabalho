#!/usr/bin/env bash

# Definindo a URL base
BASE_URL="http://localhost:8080/api"

echo "=== Testando Endpoints de Usuários ==="
# Listar todos os usuários
echo "GET /api/users"
curl -X GET "$BASE_URL/users" \
  -H "Content-Type: application/json" \
  | json_pp

echo -e "\n"

# Buscar usuário específico
echo "GET /api/users/1"
curl -X GET "$BASE_URL/users/1" \
  -H "Content-Type: application/json" \
  | json_pp

echo -e "\n"

echo "=== Testando Endpoints de Meses ==="
# Buscar meses por usuário
echo "GET /api/months/user/1"
curl -X GET "$BASE_URL/months/user/1" \
  -H "Content-Type: application/json" \
  | json_pp

echo -e "\n"

echo "=== Testando Endpoints de Tipos de Transação ==="
# Listar todos os tipos de transação
echo "GET /api/transaction-types"
curl -X GET "$BASE_URL/transaction-types" \
  -H "Content-Type: application/json" \
  | json_pp

echo -e "\n"

echo "=== Testando Endpoints de Transações ==="
# Buscar transações por mês
echo "GET /api/transactions/month/1"
curl -X GET "$BASE_URL/transactions/month/1" \
  -H "Content-Type: application/json" \
  | json_pp
