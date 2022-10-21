namespace Badamoc
{
    partial class Connexion
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.panel1 = new System.Windows.Forms.Panel();
            this.NEGOSUDbox = new System.Windows.Forms.Label();
            this.EmailBox = new System.Windows.Forms.TextBox();
            this.Email = new System.Windows.Forms.Label();
            this.Mdp = new System.Windows.Forms.Label();
            this.MdpBox = new System.Windows.Forms.TextBox();
            this.imageList1 = new System.Windows.Forms.ImageList(this.components);
            this.Connecter = new System.Windows.Forms.Button();
            this.connexionbox = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(76)))), ((int)(((byte)(0)))), ((int)(((byte)(12)))));
            this.panel1.BackgroundImage = global::Badamoc.Properties.Resources.NEGOSUD;
            this.panel1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center;
            this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(493, 639);
            this.panel1.TabIndex = 1;
            // 
            // NEGOSUDbox
            // 
            this.NEGOSUDbox.AutoSize = true;
            this.NEGOSUDbox.BackColor = System.Drawing.Color.WhiteSmoke;
            this.NEGOSUDbox.Font = new System.Drawing.Font("Arial Black", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.NEGOSUDbox.ForeColor = System.Drawing.SystemColors.ControlText;
            this.NEGOSUDbox.Location = new System.Drawing.Point(656, 126);
            this.NEGOSUDbox.Name = "NEGOSUDbox";
            this.NEGOSUDbox.Size = new System.Drawing.Size(106, 28);
            this.NEGOSUDbox.TabIndex = 2;
            this.NEGOSUDbox.Text = "Negosud";
            this.NEGOSUDbox.Click += new System.EventHandler(this.label1_Click);
            // 
            // EmailBox
            // 
            this.EmailBox.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(208)))), ((int)(((byte)(179)))), ((int)(((byte)(123)))));
            this.EmailBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.EmailBox.Location = new System.Drawing.Point(594, 258);
            this.EmailBox.Name = "EmailBox";
            this.EmailBox.Size = new System.Drawing.Size(221, 30);
            this.EmailBox.TabIndex = 4;
            // 
            // Email
            // 
            this.Email.AutoSize = true;
            this.Email.BackColor = System.Drawing.Color.WhiteSmoke;
            this.Email.Font = new System.Drawing.Font("Arial Black", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.Email.ForeColor = System.Drawing.SystemColors.ControlText;
            this.Email.Location = new System.Drawing.Point(594, 209);
            this.Email.Name = "Email";
            this.Email.Size = new System.Drawing.Size(73, 28);
            this.Email.TabIndex = 5;
            this.Email.Text = "Email";
            this.Email.Click += new System.EventHandler(this.label2_Click);
            // 
            // Mdp
            // 
            this.Mdp.AutoSize = true;
            this.Mdp.BackColor = System.Drawing.Color.WhiteSmoke;
            this.Mdp.Font = new System.Drawing.Font("Arial Black", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point);
            this.Mdp.ForeColor = System.Drawing.SystemColors.ControlText;
            this.Mdp.Location = new System.Drawing.Point(594, 303);
            this.Mdp.Name = "Mdp";
            this.Mdp.Size = new System.Drawing.Size(168, 28);
            this.Mdp.TabIndex = 7;
            this.Mdp.Text = "Mots de passe";
            this.Mdp.Click += new System.EventHandler(this.label3_Click);
            // 
            // MdpBox
            // 
            this.MdpBox.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(208)))), ((int)(((byte)(179)))), ((int)(((byte)(123)))));
            this.MdpBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.MdpBox.Location = new System.Drawing.Point(594, 334);
            this.MdpBox.Name = "MdpBox";
            this.MdpBox.Size = new System.Drawing.Size(221, 30);
            this.MdpBox.TabIndex = 6;
            this.MdpBox.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // imageList1
            // 
            this.imageList1.ColorDepth = System.Windows.Forms.ColorDepth.Depth8Bit;
            this.imageList1.ImageSize = new System.Drawing.Size(16, 16);
            this.imageList1.TransparentColor = System.Drawing.Color.Transparent;
            // 
            // Connecter
            // 
            this.Connecter.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(76)))), ((int)(((byte)(0)))), ((int)(((byte)(12)))));
            this.Connecter.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Connecter.ForeColor = System.Drawing.Color.WhiteSmoke;
            this.Connecter.Location = new System.Drawing.Point(628, 389);
            this.Connecter.Name = "Connecter";
            this.Connecter.Size = new System.Drawing.Size(162, 33);
            this.Connecter.TabIndex = 8;
            this.Connecter.Text = "Se connecter";
            this.Connecter.UseVisualStyleBackColor = true;
            this.Connecter.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // connexionbox
            // 
            this.connexionbox.BackColor = System.Drawing.Color.WhiteSmoke;
            this.connexionbox.Location = new System.Drawing.Point(555, 65);
            this.connexionbox.Multiline = true;
            this.connexionbox.Name = "connexionbox";
            this.connexionbox.Size = new System.Drawing.Size(310, 506);
            this.connexionbox.TabIndex = 9;
            // 
            // textBox3
            // 
            this.textBox3.BackColor = System.Drawing.Color.Gainsboro;
            this.textBox3.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.textBox3.Location = new System.Drawing.Point(565, 77);
            this.textBox3.Multiline = true;
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(310, 506);
            this.textBox3.TabIndex = 10;
            // 
            // Connexion
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 24F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.WhiteSmoke;
            this.ClientSize = new System.Drawing.Size(921, 639);
            this.Controls.Add(this.EmailBox);
            this.Controls.Add(this.Connecter);
            this.Controls.Add(this.Mdp);
            this.Controls.Add(this.MdpBox);
            this.Controls.Add(this.Email);
            this.Controls.Add(this.NEGOSUDbox);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.connexionbox);
            this.Controls.Add(this.textBox3);
            this.Cursor = System.Windows.Forms.Cursors.Default;
            this.Font = new System.Drawing.Font("Arial Narrow", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point);
            this.ImeMode = System.Windows.Forms.ImeMode.NoControl;
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "Connexion";
            this.Text = "Connexion";
            this.Load += new System.EventHandler(this.Connexion_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private Panel panel1;
        private Label NEGOSUDbox;
        private TextBox EmailBox;
        private Label Email;
        private Label Mdp;
        private TextBox MdpBox;
        private ImageList imageList1;
        private Button Connecter;
        private TextBox connexionbox;
        private TextBox textBox3;
    }
}