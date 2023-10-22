from setuptools import setup, find_packages

setup(
    name='AldGPT',
    version='0.1',
    packages=find_packages(),
    install_requires=[
        'connexion',  
        'flask',       
    ],
    author='Silvokyda',
    author_email='silvansowino1@gmail.com',
    description='Ald-GPT: Code Generation Tool',
    long_description='Ald-GPT is a code generation tool...',
    url='https://github.com/Alidante254/dev_auto',
    license='Your License',
    classifiers=[
        'Development Status :: 3 - Alpha',
        'Intended Audience :: Developers',
        'Programming Language :: Python :: 3',
        'License :: OSI Approved :: Your License',
    ],
)
