using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace hospital
{
    public partial class home : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=Database1.mdf;Integrated Security=True;User Instance=True");
        public home()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            admin_login al = new admin_login();
            al.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            doctor_login dl = new doctor_login();
            dl.Show();
        }
    }
}
