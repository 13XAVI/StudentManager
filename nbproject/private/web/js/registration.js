
// Get references to the two select elements
const facultySelect = document.getElementById("faculty");
const departmentSelect = document.getElementById("department");

// Define a function to populate the city select element based on the country selection
function populateDepartments() {
  // Clear any existing options in the city select element
  departmentSelect.innerHTML = "";

  // Determine the selected country
  const selectedFaculty = facultySelect.value;

  // Generate options based on the selected country
  switch (selectedFaculty) {
    case "Information_Technology":
      departmentSelect.add(new Option("Software Engineering", "Software Engineering", { "data-i18n": "software" }));
      departmentSelect.add(new Option("Information Management", "Information Management", { "data-i18n": "info" }));
      departmentSelect.add(new Option("Networks and Communication", "Networks and Communication", { "data-i18n": "networks" }));
      break;
    case "Education":
      departmentSelect.add(new Option("Mathematics", "Mathematics", { "data-i18n": "mathematics" }));
      departmentSelect.add(new Option("History", "History", { "data-i18n": "history" }));
      departmentSelect.add(new Option("Economics", "Economics", { "data-i18n": "economics" }));
      break;
    case "Business":
      departmentSelect.add(new Option("Marketing", "Marketing", { "data-i18n": "marketing" }));
      departmentSelect.add(new Option("Management", "Management", { "data-i18n": "management" }));
      break;


  }
}

// Attach an event listener to the country select element to populate the city select element when the selection changes
facultySelect.addEventListener("change", populateDepartments);


const translations = {
  en: {

    title: "Registration Form",
    description: "Please fill this form with accurate information",
    personal_information: "Personal Information",
    id: "ID",
    first_name: "First Name",
    last_name: "Last Name",
    gender: "Gender",
    select_one: "select",
    male: "Male",
    female: "Female",
    none: "Prefer not to say",
    dob: "Date of Birth",
    photo: "Upload a profile picture",
    address_contact: "Address/Contact",
    nationality: "Nationality",
    email: "Email",
    tel_personal: "Telephone Number",
    tel_parent: "Parent Contact",
    academic: "Academic Information",
    certificate: "Upload your High School Certificate",
    faculty: "Faculty",
    it: "Information Technology",
    education: "Education",
    business: "Business",
    department: "Department",
    register: "Register",
    management: "Management",
    marketing: "Marketing",
    economics: "Economics",
    history: "History",
    mathematics: "Mathematics",
    info: "Information Management",
    networks: "Networks and Communication",
    software: "Software Engineering"



  },
  fr: {
    title: "Formulaire d'inscription",
    description: "Veuillez remplir ce formulaire avec des informations exactes",
    personal_information: "Informations personnelles",
    id: "ID",
    first_name: "Prénom",
    last_name: "Nom de famille",
    gender: "Genre",
    select_one: "sélectionnez-en un",
    male: "Masculin",
    female: "Féminin",
    none: "Je préfère ne pas le dire",
    dob: "Date de naissance",
    photo: "Télécharger une photo de profil",
    address_contact: "Adresse/Contact",
    nationality: "Nationalité",
    email: "Email",
    tel_personal: "Numéro de téléphone",
    tel_parent: "Téléphone des parents",
    academic: "Information Académique",
    certificate: "Téléchargez votre certificat d'études secondaires",
    faculty: "Faculté",
    it: "Informatique",
    education: "Éducation",
    business: "Business",
    department: "Département",
    register: "Enregistrer",

    management: "Gestion",
    marketing: "Commercialisation",
    economics: "Économie",
    history: "Histoire",
    mathematics: "Mathématiques",
    info: "Gestion de l'information",
    networks: "Réseaux et communication",
    software: "Génie logiciel"
  },
  kin: {

    title: "Ifishi yo kwiyandikisha",
    description: "Nyamuneka wuzuze iyi fomu n\'amakuru yukuri",
    personal_information: "Amakuru Bwite",
    id: "Inomero y\'irangamuntu",
    first_name: "Izina ryambere",
    last_name: "Izina ry\' umuryango",
    gender: "Igitsina",
    select_one: "hitamo",
    male: "Gabo",
    female: "Gore",
    none: "Hitamo kutavuga",
    dob: "Itariki y'amavuko",
    photo: "Shiraho ishusho y\'umwirondoro",
    address_contact: "Aderesi",
    nationality: "Ubwenegihugu",
    email: "Imeri",
    tel_personal: "Inomero ya terefone",
    tel_parent: "Terefone y'ababyeyi",
    academic: "Amakuru Yamasomo",
    certificate: "Icyemezo cyawe cy'Amashuri Yisumbuye",
    faculty: "Ishami",
    it: "Ikoranabuhanga",
    education: "Uburezi",
    business: "Ubucuruzi",
    department: "Ishami",
    register: "Iyandikishe",

    management: "Icungamutungo",
    marketing: "Kwamamaza",
    economics: "Ubukungu",
    history: "Amateka",
    mathematics: "Imibare",
    info: "Gucunga amakuru",
    networks: "Imiyoboro n'itumanaho",
    software: "Ubwubatsi bwa software"
  }
};
// function to update all elements with translations
function updateTranslations(lang) {
  // get all elements with a data-i18n attribute
  const elements = document.querySelectorAll("[data-i18n]");
  // loop through all elements and update their text
  for (let element of elements) {
    const key = element.getAttribute("data-i18n");
    element.textContent = translations[lang][key];
  }
  // update navigation links
  const navLinks = document.querySelectorAll("[data-i18n-nav]");
  for (let link of navLinks) {
    const key = link.getAttribute("data-i18n-nav");
    link.textContent = translations[lang].nav[key];
  }
}

// function to get the current language from the select element
function getCurrentLanguage() {
  const select = document.getElementById("language-select");
  return select.value;
}

// function to set the current language to a new value
function setCurrentLanguage(lang) {
  const select = document.getElementById("language-select");
  select.value = lang;
}

// add event listener to update translations when select value changes
const select = document.getElementById("language-select");
select.addEventListener("change", () => {
  const lang = getCurrentLanguage();
  updateTranslations(lang);
});

// set initial language based on the select element value
const lang = getCurrentLanguage();
updateTranslations(lang);
