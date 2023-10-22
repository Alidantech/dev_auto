from flask_cors import CORS
import connexion

# Initialize the Connexion app
app = connexion.FlaskApp(__name__, specification_dir='openapi/')
app.add_api('aldgpt.yaml')  

# Initialize the Flask app
flask_app = app.app

# Define your API operations
def generate_code(language, app_structure, functionality):
    generated_code = f"Generated code in {language} for {app_structure} with {functionality}"
    return generated_code

if __name__ == '__main__':
    # Run the Connexion app
    app.run(port=8080)
