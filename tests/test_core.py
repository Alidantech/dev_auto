# ald-gpt/tests/test_core.py
from src.core import generate_code

def test_generate_code():
    language = "Python"
    app_structure = "Web App"
    functionality = "User Authentication"
    expected_output = "Generated code in Python for Web App with User Authentication"
    
    result = generate_code(language, app_structure, functionality)
    assert result == expected_output
