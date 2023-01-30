using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace NumeroISBN
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
            this.btnExe.Clicked += CalculateISBN;
        }

        public void CalculateISBN(object sender, EventArgs e)
        {
            int sumaNumeros = 0;

            char[] numberMap = this.inIsbn.Text.ToCharArray();

            for (int i = 0; i < numberMap.Length; i++)
            {
                int n = int.Parse(numberMap[i].ToString());
                sumaNumeros += n * (i + 1);
            }
            int resto = sumaNumeros % 11;
            if (resto == 0)
            {
                lbValidated.Text = "ISBN CORRECTO";
            }
            else
            {
                lbValidated.Text = "ISBN INCORRECTO";
            }
        }
    }

}
