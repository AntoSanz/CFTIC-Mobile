using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace FormularioConAlertas
{
    public partial class MainPage : ContentPage
    {
        class Student
        {
            string _Name;
            string _Surname;
            int _Age;
            string _City;
            string _Gender;
            bool _TermsAndConditions;

            public bool TermsAndConditions { get => _TermsAndConditions; set => _TermsAndConditions = value; }
            public string Gender { get => _Gender; set => _Gender = value; }
            public string City { get => _City; set => _City = value; }
            public int Age { get => _Age; set => _Age = value; }
            public string Surname { get => _Surname; set => _Surname = value; }
            public string Name { get => _Name; set => _Name = value; }
        }

        Student myStudent = new Student();

        public MainPage()
        {
            InitializeComponent();
            this.btnTermsAndConditions.Clicked += TermsAndConditions_Onclick;
            this.btnGender.Clicked += Gender_OnClick;
            this.btnAccept.Clicked += Accept_OnClick;
        }

        private async void Gender_OnClick(object sender, EventArgs args)
        {
            String option = await DisplayActionSheet("Selecciona sexo", "Cancelar", null, "Hombre", "Mujer");
            myStudent.Gender = option;
        }

        private async void TermsAndConditions_Onclick(object sender, EventArgs args)
        {
            bool option = await DisplayAlert("Términos de uso", "¿Acepta nuestra Política de privacidad para seguir recibiendo información?", "Si", "No");
            myStudent.TermsAndConditions = option;
        }

        private void Accept_OnClick(object sender, EventArgs args)
        {
            getStudentData();
            DisplayAlert("Datos guardados", "Datos guardados correctamente", "Cerrar");
        }

        private void getStudentData()
        {
            int i = 0;
            bool CanConvert = int.TryParse(this.inAge.Text, out i);

            if (CanConvert == false)
            {
                DisplayAlert("Dato incorrecto", "El tipo de dato para la edad es incorrecto", "Volver");
                return;
            }

            if (this.inAge.Text == null || this.inName.Text == String.Empty || this.inSurName.Text == String.Empty || this.inCity.Text == String.Empty)
            {
                DisplayAlert("Complete datos", "Debe rellenar todos los valores", "Volver");
                return;
            }

            if (myStudent.Gender == String.Empty) 
            {
                DisplayAlert("Complete datos", "Debe rellenar todos los valores", "Volver");
                return;
            }

            if (myStudent.TermsAndConditions == false)
            {
                DisplayAlert("Aceptar términos", "No ha aceptado los términos y condiciones", "Cerrar");
                return;
            }

            myStudent.Age = int.Parse(this.inAge.Text);
            myStudent.Name = this.inName.Text;
            myStudent.Surname = this.inSurName.Text;
            myStudent.City = this.inCity.Text;
        }
    }
}
